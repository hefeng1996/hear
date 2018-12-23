package com.he.hear.mapper;


import com.he.hear.pojo.Praise;

import java.util.List;


public interface PraiseMapper {
   List<Praise> getPraise(Integer mid);
   boolean insertPraise(Praise praise);
   boolean deletePraise(Integer pid);
}
