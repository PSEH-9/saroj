package com.sapient.football.controller;

import com.sapient.football.model.Country;
import com.sapient.football.model.CountryLeague;
import com.sapient.football.model.CountryLeagueList;
import com.sapient.football.model.CountryList;
import com.sapient.football.model.Events;
import com.sapient.football.model.EventsList;
import com.sapient.football.model.League;
import com.sapient.football.model.Lineup;
import com.sapient.football.model.PlayerList;
import com.sapient.football.model.Players;
import com.sapient.football.model.Standings;
import com.sapient.football.model.StandingsList;
import com.sapient.football.model.Team;
import com.sapient.football.model.TeamList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FootballController {
	@Autowired
	private RestTemplate restTemplate;
	private static String KEY = "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
	private static String ROOT_URL = "https://apiv2.apifootball.com/?action=";

	@GetMapping("/getAllCountry")
	public CountryList getCountry() throws Exception {
		Country[] cnt = restTemplate.getForObject(ROOT_URL + "get_countries&APIkey=" + KEY, Country[].class);
		CountryList countryList = new CountryList();
		for (int i = 0; i < cnt.length; i++) {
			cnt[i].getCountryId();
			cnt[i].getCountryName();
			countryList.setCountries(cnt);
		}
		return countryList;

	}

	@GetMapping("/getLeague/{country_id}")
	public CountryLeagueList getLeagues(@PathVariable("country_id") int countryId) throws Exception {

		CountryLeague[] countryLeagueList = restTemplate.getForObject(
				ROOT_URL + "get_leagues&country_id=" + countryId + "&APIkey=" + KEY, CountryLeague[].class);
		CountryLeagueList countryLeaguesList = new CountryLeagueList();
		for (int i = 0; i < countryLeagueList.length; i++) {
			countryLeaguesList.setCountryLeagues(countryLeagueList);
		}
		return countryLeaguesList;

	}

	@GetMapping("/getTeams/{league_id}")
	public TeamList getTeams(@PathVariable("league_id") int leagueId) throws Exception {
		Team[] teams = restTemplate.getForObject(ROOT_URL + "get_teams&league_id=" + leagueId + "&APIkey=" + KEY,
				Team[].class);
		TeamList teamList = new TeamList();
		for (int i = 0; i < teams.length; i++) {
			teamList.setTeams(teams);
		}
		return teamList;
	}

	@GetMapping("/getPlayer/{player_name}")
	public PlayerList getPlayerInfo(@PathVariable("player_name") String playerName) throws Exception {
		Players[] players = restTemplate
				.getForObject(ROOT_URL + "get_players&player_name=" + playerName + "&APIkey=" + KEY, Players[].class);
		PlayerList playerList = new PlayerList();
		for (int i = 0; i < players.length; i++) {
			playerList.setPlayers(players);
		}
		return playerList;
	}

	@GetMapping("/getStandings/{league_id}")
	public StandingsList getStandings(@PathVariable("league_id") int leagueId) throws Exception {

		Standings[] standings = restTemplate
				.getForObject(ROOT_URL + "get_standings&league_id=" + leagueId + "&APIkey=" + KEY, Standings[].class);
		StandingsList standingsList = new StandingsList();
		for (int i = 0; i < standings.length; i++) {
			standingsList.setStandings(standings);
		}
		return standingsList;
	}

	@GetMapping("/getEvents/{from}/{to}/{league_id}")
	public EventsList getEvents(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable("league_id") String leaguId) throws Exception {

		Events[] events = restTemplate.getForObject(
				ROOT_URL + "get_events&from=" + from + "&to=" + to + "&league_id=" + leaguId + "&APIkey=" + KEY,
				Events[].class);

		EventsList eventsList = new EventsList();
		for (int i = 0; i < events.length; i++) {
			eventsList.setEvents(events);
		}
		return eventsList;
	}

	@GetMapping("/getLineup/{match_id}")
	public Events getLineUps(@PathVariable("match_id") int matchId) throws Exception {
		Events e = new Events();
		e.setMatchId(matchId);
		e.setLineup(restTemplate.getForObject(ROOT_URL + "get_lineups&match_id=" + matchId + "&APIkey=" + KEY,
				Lineup.class));
//		Lineup lin = restTemplate.getForObject(ROOT_URL + "get_lineups&match_id=" + matchId + "&APIkey=" + KEY,
//				Lineup.class);

		return e;
	}

}
