package com.study.android20902.extension

import java.math.BigInteger
import java.security.MessageDigest

//Extension function to String class
fun String.toMd5(): String {
    val md = MessageDigest.getInstance("MD5")
    return BigInteger(1, md.digest(toByteArray()))
        .toString(16)
        .padStart(32, '0')
}
