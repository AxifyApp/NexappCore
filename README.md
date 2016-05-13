# Nexapp Core
Several classes that we use everyday.

## Provided by the library
**ServiceLocator**: The super lightweight anti-pattern to inject dependencies easily. Generally combined with the BaseContext class. <br />
**EmailValidator**: Perform email validations. <br />
**NumberPresenter**: A helper to present numbers in various forms (rounded or not, with n decimals, etc.) <br />
**FileReader**: Two implementations available: CSV reader and Line per Line reader.

## How to use it
At the moment, this project is hosted on GitHub and not on Maven Central.

In your `pom.xml`, you must add the GitHub repository as follows:
```
<repositories>
	<repository>
		<id>nexapp-core-mvn-repo</id>
		<url>https://raw.github.com/nexapp/nexappcore/mvn-repo/</url>
		<snapshots>
			<enabled>true</enabled>
			<updatePolicy>always</updatePolicy>
		</snapshots>
	</repository>
</repositories>
```

Then, you simply add the dependency as follows:
```
<dependency>
	<groupId>ca.nexapp</groupId>
	<artifactId>core</artifactId>
	<version>0.0.3</version>
</dependency>
```
