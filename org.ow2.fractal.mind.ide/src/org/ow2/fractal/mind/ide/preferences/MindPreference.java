package org.ow2.fractal.mind.ide.preferences;


import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.ow2.fractal.mind.ide.MindActivator;
import org.ow2.fractal.mind.ide.impl.CDTUtil;

public class MindPreference implements IPreferenceChangeListener {

	
	private IEclipsePreferences _preference;

	public String getMindCLocation() {
		return getPreferences().get(PreferenceConstants.P_MINDC_LOCATION, null);
	}
	
	public String getMindCMainClass() {
		return getPreferences().get(PreferenceConstants.P_MINDC_MAIN_CLASS, null);
	}

	public IEclipsePreferences getPreferences() {
		if (_preference == null) {
			InstanceScope instanceScope = new InstanceScope();
			_preference = instanceScope.getNode(MindActivator.ID);
		}
		return _preference;
	}
	
	public void initListener() {
		getPreferences().addPreferenceChangeListener(this);
	}

	@Override
	public void preferenceChange(PreferenceChangeEvent event) {
		if (event.getKey().equals(PreferenceConstants.P_MINDC_LOCATION))
			CDTUtil.changeMINDCLocation((String) event.getNewValue());
	}

	public void dispose() {
		getPreferences().removePreferenceChangeListener(this);
	}
}
