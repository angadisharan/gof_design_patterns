package org.cleancoding.structural.facade;

public class CourseFacade {

    private VideoService videoService;
    private CertificationService certificationService;
    private NotificationService notificationService;

    public CourseFacade() {
        videoService = new VideoService();
        certificationService = new CertificationService();
        notificationService = new NotificationService();
    }

    public void startCourse() {

        videoService.loadVideo();
        certificationService.prepareCertificate();
        notificationService.sendNotification();
    }
}