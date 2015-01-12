package com.xabber.android.ui.dialog;

import android.app.AlertDialog.Builder;
import android.support.v4.app.DialogFragment;

import com.xabber.android.data.SettingsManager;
import com.xabber.androiddev.R;

public class StartAtBootDialogFragment extends ConfirmDialogFragment {

	public static DialogFragment newInstance() {
		return new StartAtBootDialogFragment();
	}

	@Override
	protected Builder getBuilder() {
		return new Builder(getActivity())
				.setMessage(R.string.start_at_boot_suggest);
	}

	@Override
	protected boolean onPositiveClick() {
		SettingsManager.setStartAtBootSuggested();
		SettingsManager.setConnectionStartAtBoot(true);
		return true;
	}

	@Override
	protected boolean onNegativeClicked() {
		SettingsManager.setStartAtBootSuggested();
		return true;
	}

}
