import com.ncp.enums.Credential
import com.ncp.enums.Part
import com.ncp.enums.Project
import org.jenkinsci.plugins.workflow.libs.Library

@Library('shared') _
/**
 * @author Jaedoo Lee
 */

node {
  stage("GIT PULL") {
    gitPull()
  }
}

def gitPull() {
  sh label: '', script: '''cd /home/ubuntu/ansibles
  git pull https://github.com/LeeJaeDoo/ansibles.git master'''
}