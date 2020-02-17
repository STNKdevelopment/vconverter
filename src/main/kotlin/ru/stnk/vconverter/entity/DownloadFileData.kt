package ru.stnk.vconverter.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.util.UUID
import javax.persistence.*


@Entity
class DownloadFileData: AuditModel(), Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonIgnore
    var id: Long? = null

    @Column(name = "uuid")
    lateinit var uuid: String

    @Column(name = "original_name")
    lateinit var originalName: String

    @Column(name = "path_video_file")
    lateinit var pathVideoFile: String

    @Column(name = "path_preview_image_file")
    lateinit var pathImageFile: String
}