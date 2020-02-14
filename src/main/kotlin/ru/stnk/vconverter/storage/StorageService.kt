package ru.stnk.vconverter.storage

import org.springframework.core.io.Resource
import org.springframework.web.multipart.MultipartFile
import java.io.IOException
import java.nio.file.Path
import java.util.stream.Stream


interface StorageService {

    fun init()

    fun store(file: MultipartFile): String

    fun loadAll(): Stream<Path>

    fun load(filename: String): Path

    fun loadAsResource(filename: String): Resource

    fun deleteAll()

}