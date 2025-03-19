package org.vaadin.example;

import com.vaadin.flow.component.AbstractField.ComponentValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends Div {
    private static final ValueChangeListener<ComponentValueChangeEvent<Select<String>, String>> NO_OP = (event) -> {
    };

    public MainView() {
        getStyle().setPadding("2em");

        /* Field palette */
        // TextField firstName = new TextField("First name");
        // TextField lastName = new TextField("Last name");
        // Select<String> country = new Select<>("Country", NO_OP, "Finland");
        // Select<String> city = new Select<>("City", NO_OP, "Helsinki", "Turku");
        // TextField zipCode = new TextField("ZIP code");
        // TextArea streetAddress = new TextArea("Street address");

        /* Form Layout */
        FormLayout formLayout = new FormLayout();
        add(formLayout);
    }
}
