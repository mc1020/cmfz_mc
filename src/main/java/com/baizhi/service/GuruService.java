package com.baizhi.service;

import com.baizhi.entity.Guru;

public interface GuruService extends BaseService<Guru> {
    void deleteRows(String[] ids);

    void updatePicture(Guru guru);
}
