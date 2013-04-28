package oop.appengine.examples.showcase.webservice.soap.response;

import javax.xml.bind.annotation.XmlType;

import oop.appengine.examples.showcase.webservice.soap.WsConstants;
import oop.appengine.examples.showcase.webservice.soap.response.base.WSResult;
import oop.appengine.examples.showcase.webservice.soap.response.dto.TeamDTO;

@XmlType(name = "GetTeamDetailResult", namespace = WsConstants.NS)
public class GetTeamDetailResult extends WSResult {

	private TeamDTO team;

	public GetTeamDetailResult() {
	}

	public GetTeamDetailResult(TeamDTO team) {
		this.team = team;
	}

	public TeamDTO getTeam() {
		return team;
	}

	public void setTeam(TeamDTO team) {
		this.team = team;
	}
}
