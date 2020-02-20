# Open Identity - Android SDK

[![Travis][img-travis-master]][url-travis-master]
[![Coverage Status][img-coveralls-master]][url-coveralls-master]
[![Codacy Badge][img-codacy]][url-codacy]
[![Release][img-jitpack]][url-jitpack]
[![License][img-license]][url-bintray]

[![GithubWatch][img-github-watchers]][url-github-watchers]
[![GithubStars][img-github-stars]][url-github-stars]
[![GithubForks][img-github-forks]][url-github-forks]

## Minimal Requirements
*   API 27 or above
*   Java 8.x
*   Android SDK Tools 26.1.1+
*   Android SDK Platform Tools 27.0.1+
*   Android Build Tools version 27.0.0+

## Installing the SDK
1.  Add the JitPack repository to the your root `build.gradle` file at the end of the repository.
    ```gradle
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
    ```

2. Add the dependency for the Open Identity Android SDK:
    ```gradle
    dependencies {
        compile 'com.github.open-identity-fabric:open-identity-android-sdk:1.+'
    }
    ```

3. Within your Android project in Android Studio, open the build.gradle file of your app module (not the project build.gradle), and add the following line to the defaultConfig:
    ```defaultConfig {
        ...
        manifestPlaceholders = ['openIdRedirectScheme': android.defaultConfig.applicationId]
    }
    ```

## Initializing the Open Identity Android SDK

Initialize the SDK by passing the context, client_id and discovery endpoint URL init method. A common, though not mandatory, place to put the initialization code is in the `onCreate` method of the main activity in your Android application.

```java
OpenIdentity.getInstance().initialize(getApplicationContext(), <client_id>, <discoveryEndpointUrl>);
```

## Authenticating with service provided login UI
(aka authorization code grant)

## Authenticating with custom UI
(aka resource owner password credential grant)

## Authenticating with refresh token

## Logging out

## Invoking protected resources

### Access and Identity tokens

### Using access token to make requests to protected resources

## Self-service

### Sign up

### Change Password

### Forgot Password

### Update Profile

## If you have questions
Join us on [Slack](https://public-slack-channel.com) and chat with our dev team.

## License
This package contains code licensed under the Apache License, Version 2.0 (the "License"). You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 and may also view the License in the LICENSE file within this package.

[img-travis-master]: https://travis-ci.org/open-identity-fabric/open-identity-android-sdk.svg
[url-travis-master]: https://travis-ci.org/open-identity-fabric/open-identity-android-sdk

[img-coveralls-master]: https://coveralls.io/repos/github/open-identity-fabric/open-identity-android-sdk/badge.svg?branch=master
[url-coveralls-master]: https://coveralls.io/github/open-identity-fabric/open-identity-android-sdk?branch=master

[img-codacy]: https://api.codacy.com/project/badge/Grade/eabcbbdacdf04ff3a620d8c832b8ce81
[url-codacy]: https://app.codacy.com/gh/open-identity-fabric/open-identity-android-sdk/dashboard

[img-jitpack]: https://jitpack.io/v/open-identity-fabric/open-identity-android-sdk.svg
[url-jitpack]: https://jitpack.io/#open-identity-fabric/open-identity-android-sdk

[img-license]: https://img.shields.io/github/license/open-identity-fabric/open-identity-android-sdk.svg

[url-bintray]: https://bintray.com/open-identity-fabric/open-identity-android-sdk

[img-github-watchers]: https://img.shields.io/github/watchers/open-identity-fabric/open-identity-android-sdk.svg?style=social&label=Watch
[url-github-watchers]: https://github.com/open-identity-fabric/open-identity-android-sdk/watchers
[img-github-stars]: https://img.shields.io/github/stars/open-identity-fabric/open-identity-android-sdk.svg?style=social&label=Star
[url-github-stars]: https://github.com/open-identity-fabric/open-identity-android-sdk/stargazers
[img-github-forks]: https://img.shields.io/github/forks/open-identity-fabric/open-identity-android-sdk.svg?style=social&label=Fork
[url-github-forks]: https://github.com/open-identity-fabric/open-identity-android-sdk/network