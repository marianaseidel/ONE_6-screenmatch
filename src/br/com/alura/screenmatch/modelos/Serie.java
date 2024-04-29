package br.com.alura.screenmatch.modelos;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodesBySeasons;
    private int minutesByEpisodes;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesBySeasons() {
        return episodesBySeasons;
    }

    public void setEpisodesBySeasons(int episodesBySeasons) {
        this.episodesBySeasons = episodesBySeasons;
    }

    public int getMinutesByEpisodes() {
        return minutesByEpisodes;
    }

    public void setMinutesByEpisodes(int minutesByEpisodes) {
        this.minutesByEpisodes = minutesByEpisodes;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesBySeasons * minutesByEpisodes;
    }
}
