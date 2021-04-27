package com.javarush.task.task32.task3209.actions;

import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StrikeThroughAction extends StyledEditorKit.StyledTextAction {
    //отвечает за "зачеркнутый" стиль текста

    public StrikeThroughAction() {
        super(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
