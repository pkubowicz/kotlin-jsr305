Demonstrates a bug in IntelliJ synchronization of Kotlin settings with Gradle.

- `warn` subproject is compiled with `-Xjsr305=warn`
- `strict` subproject is compiled with `-Xjsr305=strict`

Both contain the same class `MyExecutor` that is written in a way violating JSR 305 annotations.

Correct behaviour: `./gradlew  clean classes --continue --console=verbose`

- `warn` is compiled
- `strict` fails to compile

IntelliJ fails to synchronize Kotlin compiler settings:

- sometimes both `MyExecutor` classes are displayed as correct
- sometimes both show an error `Platform declaration clash`
