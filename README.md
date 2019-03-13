### Display number and reports for tests written in Kotlin

Default [SonarKotlin](https://docs.sonarqube.org/display/PLUG/SonarKotlin) plugin doesn't support JUnit tests written in Kotlin.
There is another plugin which can handle them [sonar-kotlin](https://github.com/arturbosch/sonar-kotlin).

#### Setup

1) Uninstall default kotlin plugin. You can find it in Marketplace section inside Administration tab.

2) Load [latest jar of sonar-kotlin](https://github.com/arturbosch/sonar-kotlin/releases) and paste it into 
`/sonarqube-{version}/extensions/plugins`

3) Restart SonarCube 
`/sonarqube-{version}/bin/{your-os}/sonar.sh restart`
