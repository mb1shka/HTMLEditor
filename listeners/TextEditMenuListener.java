package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

/*
Класс следит за моментом, когда меню редактирования выбирается пользователем.

В этот момент слушатель будет запрашивать у представления,
можем ли мы сейчас изменить стиль текста,
и в зависимости от этого делать доступными или не доступными
пункты меню "Цвет", "Шрифт" и т.д.

Пункты меню могут быть доступны только тогда, когда в нашем редакторе
выбрана первая вкладка с текстом.
 */


public class TextEditMenuListener implements MenuListener {
    private View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent e) {
        JMenu menu = (JMenu) e.getSource();
        Component[] menuComponents = menu.getMenuComponents();
        for (Component component : menuComponents) {
            component.setEnabled(view.isHtmlTabSelected());
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
