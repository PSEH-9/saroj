package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Events implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8435366860432183669L;
	@JsonProperty("match_id")
	private double matchId;
    @JsonProperty("country_id")
    private int countryId;
    @JsonProperty("country_name")
    private String countryName;
    
    @JsonProperty("league_id")
    private int leagueId;
    @JsonProperty("league_name")
    private String leagueName;
    @JsonProperty("match_date")
    private String matchDate;

    @JsonProperty("match_status")
    private String matchStatus;
    
    @JsonProperty("match_time")
    private String matchTime;
    
    @JsonProperty("match_hometeam_id")
    private int matchHometeamId;
    
    @JsonProperty("match_hometeam_name")
    private String matchHometeamName;

    @JsonProperty("match_hometeam_score")
    private int matchHometeamScore;
    
    @JsonProperty("match_awayteam_name")
    private String matchAwayteamName;
    
    @JsonProperty("match_awayteam_id")
    private int matchAwayteamId;
    
    @JsonProperty("match_awayteam_score")
    private int matchAwayteamScore;
    
    @JsonProperty("match_hometeam_halftime_score")
    private int matchHometeamHalftimeScore;
    
    @JsonProperty("match_awayteam_halftime_score")
    private int matchAwayteamHalftimeScore;
    
    @JsonProperty("match_hometeam_extra_score")
    private int matchHometeamExtraScore;
    
    @JsonProperty("match_awayteam_extra_score")
    private int matchAwayteamExtraScore;
    
    @JsonProperty("match_hometeam_penalty_score")
    private int matchHometeamPenaltyScore;
    
    @JsonProperty("match_awayteam_penalty_score")
    private int matchAwayteamPenaltyScore;
    
    @JsonProperty("match_hometeam_ft_score")
    private int matchHometeamFTScore;
    
    @JsonProperty("match_awayteam_ft_score")
    private int matchAwayteamFTScore;
    
    @JsonProperty("match_hometeam_system")
    private String matchHometeamSystem;
    
    @JsonProperty("match_awayteam_system")
    private String matchAwayteamSystem;
    
    @JsonProperty("match_live")
    private int matchLive;
    
    @JsonProperty("match_round")
    private String matchRound;
    
    @JsonProperty("match_stadium")
    private String matchMedium;
    
    @JsonProperty("match_referee")
    private String matchReferee;
    
    @JsonProperty("team_home_badge")
    private String teamHomeBadge;
    
    @JsonProperty("team_away_badge")
    private String teamAwayBadge;
    
    @JsonProperty("goalscorer")
    private GoalScorer[] goalScorer;
    
    @JsonProperty("cards")
    private Cards[] cards;
    
    @JsonProperty("substitutions")
    private Substitutions substitutions;
    
    @JsonProperty("lineup")
    private Lineup lineup;
    
    @JsonProperty("statistics")
    private Statistics[] statistics;

	public double getMatchId() {
		return matchId;
	}

	public void setMatchId(double matchId) {
		this.matchId = matchId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getMatchTime() {
		return matchTime;
	}

	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}

	public int getMatchHometeamId() {
		return matchHometeamId;
	}

	public void setMatchHometeamId(int matchHometeamId) {
		this.matchHometeamId = matchHometeamId;
	}

	public String getMatchHometeamName() {
		return matchHometeamName;
	}

	public void setMatchHometeamName(String matchHometeamName) {
		this.matchHometeamName = matchHometeamName;
	}

	public int getMatchHometeamScore() {
		return matchHometeamScore;
	}

	public void setMatchHometeamScore(int matchHometeamScore) {
		this.matchHometeamScore = matchHometeamScore;
	}

	public String getMatchAwayteamName() {
		return matchAwayteamName;
	}

	public void setMatchAwayteamName(String matchAwayteamName) {
		this.matchAwayteamName = matchAwayteamName;
	}

	public int getMatchAwayteamId() {
		return matchAwayteamId;
	}

	public void setMatchAwayteamId(int matchAwayteamId) {
		this.matchAwayteamId = matchAwayteamId;
	}

	public int getMatchAwayteamScore() {
		return matchAwayteamScore;
	}

	public void setMatchAwayteamScore(int matchAwayteamScore) {
		this.matchAwayteamScore = matchAwayteamScore;
	}

	public int getMatchHometeamHalftimeScore() {
		return matchHometeamHalftimeScore;
	}

	public void setMatchHometeamHalftimeScore(int matchHometeamHalftimeScore) {
		this.matchHometeamHalftimeScore = matchHometeamHalftimeScore;
	}

	public int getMatchAwayteamHalftimeScore() {
		return matchAwayteamHalftimeScore;
	}

	public void setMatchAwayteamHalftimeScore(int matchAwayteamHalftimeScore) {
		this.matchAwayteamHalftimeScore = matchAwayteamHalftimeScore;
	}

	public int getMatchHometeamExtraScore() {
		return matchHometeamExtraScore;
	}

	public void setMatchHometeamExtraScore(int matchHometeamExtraScore) {
		this.matchHometeamExtraScore = matchHometeamExtraScore;
	}

	public int getMatchAwayteamExtraScore() {
		return matchAwayteamExtraScore;
	}

	public void setMatchAwayteamExtraScore(int matchAwayteamExtraScore) {
		this.matchAwayteamExtraScore = matchAwayteamExtraScore;
	}

	public int getMatchHometeamPenaltyScore() {
		return matchHometeamPenaltyScore;
	}

	public void setMatchHometeamPenaltyScore(int matchHometeamPenaltyScore) {
		this.matchHometeamPenaltyScore = matchHometeamPenaltyScore;
	}

	public int getMatchAwayteamPenaltyScore() {
		return matchAwayteamPenaltyScore;
	}

	public void setMatchAwayteamPenaltyScore(int matchAwayteamPenaltyScore) {
		this.matchAwayteamPenaltyScore = matchAwayteamPenaltyScore;
	}

	public int getMatchHometeamFTScore() {
		return matchHometeamFTScore;
	}

	public void setMatchHometeamFTScore(int matchHometeamFTScore) {
		this.matchHometeamFTScore = matchHometeamFTScore;
	}

	public int getMatchAwayteamFTScore() {
		return matchAwayteamFTScore;
	}

	public void setMatchAwayteamFTScore(int matchAwayteamFTScore) {
		this.matchAwayteamFTScore = matchAwayteamFTScore;
	}

	public String getMatchHometeamSystem() {
		return matchHometeamSystem;
	}

	public void setMatchHometeamSystem(String matchHometeamSystem) {
		this.matchHometeamSystem = matchHometeamSystem;
	}

	public String getMatchAwayteamSystem() {
		return matchAwayteamSystem;
	}

	public void setMatchAwayteamSystem(String matchAwayteamSystem) {
		this.matchAwayteamSystem = matchAwayteamSystem;
	}

	public int getMatchLive() {
		return matchLive;
	}

	public void setMatchLive(int matchLive) {
		this.matchLive = matchLive;
	}

	public String getMatchRound() {
		return matchRound;
	}

	public void setMatchRound(String matchRound) {
		this.matchRound = matchRound;
	}

	public String getMatchMedium() {
		return matchMedium;
	}

	public void setMatchMedium(String matchMedium) {
		this.matchMedium = matchMedium;
	}

	public String getMatchReferee() {
		return matchReferee;
	}

	public void setMatchReferee(String matchReferee) {
		this.matchReferee = matchReferee;
	}

	public String getTeamHomeBadge() {
		return teamHomeBadge;
	}

	public void setTeamHomeBadge(String teamHomeBadge) {
		this.teamHomeBadge = teamHomeBadge;
	}

	public String getTeamAwayBadge() {
		return teamAwayBadge;
	}

	public void setTeamAwayBadge(String teamAwayBadge) {
		this.teamAwayBadge = teamAwayBadge;
	}

	public GoalScorer[] getGoalScorer() {
		return goalScorer;
	}

	public void setGoalScorer(GoalScorer[] goalScorer) {
		this.goalScorer = goalScorer;
	}

	public Cards[] getCards() {
		return cards;
	}

	public void setCards(Cards[] cards) {
		this.cards = cards;
	}

	public Substitutions getSubstitutions() {
		return substitutions;
	}

	public void setSubstitutions(Substitutions substitutions) {
		this.substitutions = substitutions;
	}

	public Lineup getLineup() {
		return lineup;
	}

	public void setLineup(Lineup lineup) {
		this.lineup = lineup;
	}

	public Statistics[] getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics[] statistics) {
		this.statistics = statistics;
	}
    


}
