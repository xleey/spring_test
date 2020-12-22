package constructorDI1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorDI1/Beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
        System.out.println(textEditor.getName());
    }
}
