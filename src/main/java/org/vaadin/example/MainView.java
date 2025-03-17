package org.vaadin.example;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends Div {

    public MainView() {
        FormLayout formLayout = new FormLayout();
        formLayout.setAutoResponsive(true);

        TextField firstName = new TextField("First name");
        TextField lastName = new TextField("Last name");

        Select<String> gender = new Select<>();
        gender.setLabel("Gender");
        gender.setItems("Male", "Female", "Other");

        EmailField email = new EmailField("Email");

        TextField address = new TextField("Address");

        Select<String> country = new Select<>();
        country.setLabel("Country");
        country.setItems("Finland");

        Select<String> city = new Select<>();
        city.setLabel("City");
        city.setItems("Helsinki", "Turku", "Tampere", "Oulu");

        formLayout.add(firstName, lastName, email, gender, address, country, city);

        add(formLayout);
    }
}
