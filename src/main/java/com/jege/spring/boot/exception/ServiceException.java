package com.jege.spring.boot.exception;


public class ServiceException extends RuntimeException {
  public ServiceException(String msg) {
    super(msg);
  }
}
