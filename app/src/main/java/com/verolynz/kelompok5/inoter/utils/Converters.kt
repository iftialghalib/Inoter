package com.verolynz.kelompok5.inoter.utils
import androidx.room.TypeConverter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
class Converters {

        private val formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME

        @TypeConverter
        fun fromTimestamp(value: String?): LocalDateTime? {
            return value?.let {
                return LocalDateTime.parse(it, formatter)
            }
        }

        @TypeConverter
        fun dateToTimestamp(date: LocalDateTime?): String? {
            return date?.format(formatter)
        }
    }