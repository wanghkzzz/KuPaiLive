package com.benben.kupaizhibo.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.benben.kupaizhibo.bean.ErrorMsg;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ERROR_MSG".
*/
public class ErrorMsgDao extends AbstractDao<ErrorMsg, Long> {

    public static final String TABLENAME = "ERROR_MSG";

    /**
     * Properties of entity ErrorMsg.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Errorinfo = new Property(1, String.class, "errorinfo", false, "ERRORINFO");
        public final static Property Versioninfo = new Property(2, String.class, "versioninfo", false, "VERSIONINFO");
        public final static Property MobileInfo = new Property(3, String.class, "mobileInfo", false, "MOBILE_INFO");
        public final static Property UserName = new Property(4, String.class, "userName", false, "USER_NAME");
        public final static Property PhoneNum = new Property(5, String.class, "phoneNum", false, "PHONE_NUM");
        public final static Property UserAddress = new Property(6, String.class, "userAddress", false, "USER_ADDRESS");
        public final static Property Time = new Property(7, String.class, "time", false, "TIME");
    }


    public ErrorMsgDao(DaoConfig config) {
        super(config);
    }
    
    public ErrorMsgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ERROR_MSG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"ERRORINFO\" TEXT," + // 1: errorinfo
                "\"VERSIONINFO\" TEXT," + // 2: versioninfo
                "\"MOBILE_INFO\" TEXT," + // 3: mobileInfo
                "\"USER_NAME\" TEXT," + // 4: userName
                "\"PHONE_NUM\" TEXT," + // 5: phoneNum
                "\"USER_ADDRESS\" TEXT," + // 6: userAddress
                "\"TIME\" TEXT);"); // 7: time
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ERROR_MSG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ErrorMsg entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String errorinfo = entity.getErrorinfo();
        if (errorinfo != null) {
            stmt.bindString(2, errorinfo);
        }
 
        String versioninfo = entity.getVersioninfo();
        if (versioninfo != null) {
            stmt.bindString(3, versioninfo);
        }
 
        String mobileInfo = entity.getMobileInfo();
        if (mobileInfo != null) {
            stmt.bindString(4, mobileInfo);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(5, userName);
        }
 
        String phoneNum = entity.getPhoneNum();
        if (phoneNum != null) {
            stmt.bindString(6, phoneNum);
        }
 
        String userAddress = entity.getUserAddress();
        if (userAddress != null) {
            stmt.bindString(7, userAddress);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(8, time);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ErrorMsg entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String errorinfo = entity.getErrorinfo();
        if (errorinfo != null) {
            stmt.bindString(2, errorinfo);
        }
 
        String versioninfo = entity.getVersioninfo();
        if (versioninfo != null) {
            stmt.bindString(3, versioninfo);
        }
 
        String mobileInfo = entity.getMobileInfo();
        if (mobileInfo != null) {
            stmt.bindString(4, mobileInfo);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(5, userName);
        }
 
        String phoneNum = entity.getPhoneNum();
        if (phoneNum != null) {
            stmt.bindString(6, phoneNum);
        }
 
        String userAddress = entity.getUserAddress();
        if (userAddress != null) {
            stmt.bindString(7, userAddress);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(8, time);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ErrorMsg readEntity(Cursor cursor, int offset) {
        ErrorMsg entity = new ErrorMsg( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // errorinfo
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // versioninfo
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // mobileInfo
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // userName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // phoneNum
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // userAddress
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // time
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ErrorMsg entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setErrorinfo(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setVersioninfo(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMobileInfo(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPhoneNum(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUserAddress(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTime(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ErrorMsg entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ErrorMsg entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ErrorMsg entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
