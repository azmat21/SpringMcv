package com.springapp.base;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by otkurbiz on 10/14/15.
 */
public interface RowMapper {
    public Object mapRow(ResultSet rs, int index)
            throws SQLException;
}
