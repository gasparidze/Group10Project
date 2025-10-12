package org.example.enums;

import javax.swing.*;

/**
 * enum - это перечисление констант
 * как правило, перечисления используется, когда есть заранее известный небольшой набор констант
 * все константы пиуштся с большой буквы , перечисляются через запятую
 */
public enum Status {
    /**
     * фактически круглые скобки означают вызов конструктора
     */
    NEW("новый"),
    IN_PROGRESS("в работе"),
    COMPLETED("завершен");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
