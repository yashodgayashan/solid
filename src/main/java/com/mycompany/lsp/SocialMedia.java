package com.mycompany.lsp;

public abstract class SocialMedia {
  public abstract void chatWithFriend(String friendName);

  public abstract void sendPhotosAndVideos(String friendName);

  public abstract void groupVideoCall(String... friendNames);

  public abstract void publishPost(String postMessage);
}
