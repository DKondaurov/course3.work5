package pro.sky.java.course3.work5.service;

import org.springframework.web.multipart.MultipartFile;
import pro.sky.java.course3.work5.model.Avatar;

import java.io.IOException;

public interface AvatarService {
    void uploadStudentAvatar(Long avatarId, MultipartFile avatarFile) throws IOException;

    Avatar findStudentAvatar(Long avatarId);
}
