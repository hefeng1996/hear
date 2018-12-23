package com.he.hear.mapper;


import com.he.hear.pojo.Album;

import java.util.List;


public interface AlbumMapper {
//    Album selectAlbumBySongId(int id);

    List<Album> selectAlbumsBySingerId(int id);
    List<Album> selectAlbumBySingerId(int id);
    //查询所有专辑，按时间升序排列
    List<Album> selectAlbum();
    Album selectAlbumById(int id);//根据专辑id查询专辑信息

}
