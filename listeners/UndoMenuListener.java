package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
/*
Класс следит за моментом, когда меню редактирования выбирается пользователем.

В этот момент слушатель будет запрашивать у представления,
можем ли мы сейчас отменить или вернуть какое-то действие,
и в зависимости от этого делать доступными или не доступными
пункты меню "Отменить" и "Вернуть".
 */

public class UndoMenuListener implements MenuListener {

    private View view;
    private JMenuItem undoMenuItem; //пункт меню "Отменить"
    private JMenuItem redoMenuItem; //пункт меню "Вернуть"

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    @Override
    public void menuSelected(MenuEvent menuEvent) {
        //метод будет вызываться перед показом меню

        undoMenuItem.setEnabled(view.canUndo());
        //спрашиваем у представления, можем ли мы отменить действие

        redoMenuItem.setEnabled(view.canRedo());
        //спрашивает у представления, можем ли мы вернуть действие
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
