/**
 *
 */
package ru.agentlab.user.service.ds.host;

import java.io.IOException;
import java.util.Dictionary;

import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

/**
 *
 * User service configurer.
 *
 * @author Pirogov
 *
 */
@Component(enabled = true, immediate = true)
public class UserServiceConfigurer implements ManagedService {

	@Reference
	public void bindCm(ConfigurationAdmin configAdmin) throws IOException {
		// Does nothing
	}

	public void unbindCm(ConfigurationAdmin configAdmin) {
		// Does nothing
	}

	@Activate
	public void activate(ComponentContext context) {
		System.out.println("UserServiceConfigurer service started"); //$NON-NLS-1$
	}

	@Deactivate
	public void deactivate(ComponentContext context) {
		System.out.println("UserServiceConfigurer service stopped"); //$NON-NLS-1$
	}

	@Modified
	public void modify() {
		System.out.println("UserServiceConfigurer service modified"); //$NON-NLS-1$
	}

	@Override
	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		// Does nothing
	}

}
