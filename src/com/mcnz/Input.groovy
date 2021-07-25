package com.mcnz

  public class Input {
    def buildIsApproved() {
    def file = new File("C:/MVN/approved.txt")
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    } 
    return false; 
  }
}
