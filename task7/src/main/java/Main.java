import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args) {
        //Установка и инициализация драйвера geckodriver
        System.setProperty("webdriver.gecko.driver", "../webdrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        //Тут необходимо задать базовую страницу, с которой начинать парсинг
        String baseUrl = "https://hh.ru/search/vacancy?L_is_autosearch=false&area=1&clusters=true&enable_snippets=true&no_magic=true&page=%d";
        List<Integer> salaries = new ArrayList<Integer>();

        //Задаем количество страниц, которые необходимо парсить
        int pageNumbers = 5;
        for(int i=0; i<pageNumbers; i++){
            driver.get(String.format(baseUrl,i));

            //достаем из всех вакансий размещенных на странице информацию о зарплатах
            List<WebElement> elements =  driver.findElements(By.className("vacancy-serp-item__compensation"));
            for(WebElement element:elements){
                //для каждой найденной зарплаты извлекаем числовое значение
                salaries.add(getSalary(element.getText()));
            }
        }
        System.out.println(salaries);
        System.out.println(getAvg(salaries));

        // Закрываем браузер
        driver.quit();
    }

    private static Integer getSalary(String salaryString){
        // Функция извлекает из строки числовое значение зарплаты
        // Берем только цифры и пробелы
        Pattern pattern = Pattern.compile("(\\d[\\d\\s]*)");
        Matcher matcher = pattern.matcher(salaryString);
        List<Integer> salaries = new ArrayList<Integer>();
        while(matcher.find()) {
            //для всех найденных значений удаляем пробелы
            salaries.add(Integer.parseInt(matcher.group().replaceAll("\\s","")));
        }

        //если в вакансии указан промежуток зарплат - берем среднюю величину
        return getAvg(salaries);
    }
    private static Integer getAvg(List<Integer> salaries){
        int sum = 0;
        for(int i=0; i<salaries.size(); i++){
            sum += salaries.get(i);
        }

        return sum/salaries.size();
    }
}