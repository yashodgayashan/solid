## Open Closed Principle

### Definition

The open/closed principle states that software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

### Scenario

Notification service can send notification to email, sms, push notification and slack. If we want to add new notification medium, we need to modify NotificationService class. So, we can create a new class for each notification medium and implement NotificationService interface.

```java
public interface NotificationService {
    void sendNotification();
}

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        // email notification logic
    }
}

public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        // sms notification logic
    }
}

public class PushNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        // push notification logic
    }
}

public class SlackNotificationService implements NotificationService {
    @Override
    public void sendNotification() {
        // slack notification logic
    }
}
```

