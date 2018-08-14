package com.suda.yzune.wakeupschedule.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.suda.yzune.wakeupschedule.bean.TimeDetailBean

@Dao
interface TimeDetailDao {
    @Insert
    fun insertTimeList(list: List<TimeDetailBean>)

    @Update
    fun updateTimeDetail(timeDetailBean: TimeDetailBean)

    @Update
    fun updateTimeDetailList(timeDetailBeanList: List<TimeDetailBean>)

    @Query("select * from timedetailbean order by node")
    fun getTimeList(): LiveData<List<TimeDetailBean>>

    @Query("select * from timedetailbean order by node")
    fun getTimeListInThread(): List<TimeDetailBean>
}