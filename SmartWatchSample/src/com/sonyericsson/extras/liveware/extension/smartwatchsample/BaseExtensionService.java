package com.sonyericsson.extras.liveware.extension.smartwatchsample;

import com.sonyericsson.extras.liveware.extension.util.ExtensionService;
import com.sonyericsson.extras.liveware.extension.util.registration.RegistrationInformation;

public class BaseExtensionService extends ExtensionService {
	
	public BaseExtensionService(String extensionKey) {
		super(extensionKey);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected RegistrationInformation getRegistrationInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean keepRunningWhenConnected() {
		// TODO Auto-generated method stub
		return false;
	}

}
