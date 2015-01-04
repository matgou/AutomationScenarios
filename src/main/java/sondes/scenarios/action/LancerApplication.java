package sondes.scenarios.action;

import org.openqa.selenium.WebDriver;

import sondes.scenarios.ScenarioException;

public class LancerApplication extends Action {
	protected String lanceur_url;
	
	public LancerApplication(String url) {
		this.lanceur_url = url;
	}
	
	@Override
	public void executeAction(WebDriver driver) throws ScenarioException {
		this.logEvent("Firefox", "Get : " + this.lanceur_url);
	    driver.get(this.lanceur_url);
	}

}
