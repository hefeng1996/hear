package com.he.hear.mapper;

public interface SonglistTagMapper {
    boolean insertSonglistTag(int songlistId, int tagId);

    boolean removeSonglistTag(int songlistId);
}
