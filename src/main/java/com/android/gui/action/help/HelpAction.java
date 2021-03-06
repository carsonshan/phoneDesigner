package com.android.gui.action.help;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.KeyStroke;

import com.android.gui.action.app.BaseAction;
import com.android.gui.dialog.HelpDailog;
import com.android.reource.ResourceUtil;

public class HelpAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private HelpDailog helpDialog = new HelpDailog();

	public HelpAction() {
		super(ResourceUtil.help_icon, "帮助（H）");
		putValue(Action.MNEMONIC_KEY, KeyEvent.VK_H);
		putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("F1"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		helpDialog.setVisible(true);
	}

}
