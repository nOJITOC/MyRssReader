package com.mmteams91.myrssreader.data.models;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.mmteams91.myrssreader.data.models.Lents;

import com.mmteams91.myrssreader.data.models.LentsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig lentsDaoConfig;

    private final LentsDao lentsDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        lentsDaoConfig = daoConfigMap.get(LentsDao.class).clone();
        lentsDaoConfig.initIdentityScope(type);

        lentsDao = new LentsDao(lentsDaoConfig, this);

        registerDao(Lents.class, lentsDao);
    }
    
    public void clear() {
        lentsDaoConfig.getIdentityScope().clear();
    }

    public LentsDao getLentsDao() {
        return lentsDao;
    }

}
