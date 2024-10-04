package com.example.dm_web.Dao;
import com.example.dm_web.bean.Video;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoDao {
    public List<Video> getVideoList();
}
