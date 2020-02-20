# Guidelines

## Branches
1.	Create a branch for each 'issue' with the issue item number as a 4 digit prefix

2.	followed by an underscore and a brief description of the topic - *do not use numbers!*  
		- it's recommended to use the subject of the work item

3.	use underscores as delimiters - *do not use slashes*

4.	commit often (best case: multiple times daily)

## Code style
Install the [Checkstyle plugin for Android Studio](https://plugins.jetbrains.com/plugin/1065-checkstyle-idea) and apply the [customized version](checkstyle.xml) of [Google's Java Style](https://checkstyle.org/google_style.html).

Detailed description: https://checkstyle.org/styleguides/google-java-style-20180523/javaguide.html

## File naming

### Class files
Class names are written in [UpperCamelCase](http://en.wikipedia.org/wiki/CamelCase).

For classes that extend an Android component, the name of the class should end with the name of the component; for example: `SignInActivity`, `SignInFragment`, `ImageUploaderService`, `ChangePasswordDialog`.

### Resources files
Resources file names are written in __lowercase_underscore__.

#### Values files
Resource files in the values folder should be __plural__, e.g. `strings.xml`, `styles.xml`, `colors.xml`, `dimens.xml`, `attrs.xml`
