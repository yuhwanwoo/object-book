package com.task.object.ch10;

public class PersonalPlaylist extends Playlist {
    public void remove(Song song) {
        getTracks().remove(song);
        getSingers().remove(song.getSinger());
    }
}
