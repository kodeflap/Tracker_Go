![Tracker Go](https://user-images.githubusercontent.com/86681482/191018347-33e990d3-e943-4509-988c-0bf587794580.gif)

<p align = "center">
      <img src = "https://badgen.net/badge/Open%20Source%20%3F/Yes%21/blue?icon=github" height = 25/>
      <a href= "https://github.com/kodeflap/Tracker_Go/tags ">
      <img src = "https://img.shields.io/github/release/kodeFlap/Tracker_Go.svg" height = 25/></a>
      <a href= "https://github.com/kodeflap/Tracker_Go/blob/master/LICENSE ">
      <img src = "https://img.shields.io/github/license/kodeFlap/Tracker_Go.svg" height = 25/></a>
      <img src = "https://img.shields.io/github/contributors/kodeFlap/Tracker_Go.svg" height = 25/></a>
      <img src = "https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square" height = 25/>
      <a href= "https://gitHub.com/kodeflap/Tracker_Go/issues/ ">
      <img src = "https://img.shields.io/github/issues/kodeFlap/Tracker_Go.svg" height = 25/></a>
</p>


# About Tracker Go

" Tracker Go" is an android application to tracks the running status by considering the parameter weight and track the  running status including average speed, time taken, calories burned, distance covered and keep record of the status history.


## Features

- Track the running route.
- Tracks in background.
- Sorting running status.
- Plot average speed in chart view
- Save the Map route track as screenshot in database.


## Tech Stack

- Kotlin
- MVVM
- Navigation Component
- Google SDK

###  Libraries

- Dagger Hilt
- Android KTX
- Room
- Timber
- Glide
- MPAndroidChart
- Easy Permission
- Coroutines
- Material Design
- Google Map location service
-  Kotlin extension


## APP ScreenShot

![App Screenshot](https://static.wixstatic.com/media/518b8e_a1cc67d0fc4b4d8e9ee7c6596157f641~mv2.jpg/v1/crop/x_8,y_0,w_877,h_771/fill/w_549,h_482,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/20220719_222647_0000_edited.jpg)


## Getting Started

## Prerequisites
 
You need to know a basic understanding of 

- Android Fundamentals.
- Kotlin language.
- Dependency Injection
- MVVM architecture
- Navigation 
- Room Database
- Coroutines.
- Integration of third party libraries.

So let's get started.

1. Install Android studio
2. Install Android SDK(28)

### Installation

1.  Check out the [Google Map SDK documentation ](https://developers.google.com/maps/documentation/android-sdk/get-api-key) and get the API key.
2. [Clone the repo](https://github.com/poojaOfficial321/Tracker_Go.git)
3. Start a new project as import from Version Control in android studio and paste the clone URL and finish.
4. Go to Android Manifest and check for <meta - data/>  tag error will be shown in it can be solved by doing the following:
 - Go to step 1 and get unique [Google Map key](https://developers.google.com/maps/documentation/android-sdk/get-api-key) and go to : 

``` res -> values -> strings 
<string android: name = "map_key"> Paste your API key Here</string>
```
So now the error will be solved.

5.  Run your application.


## Contributing

Contributions are always welcome!
Contributions are what make the open-source project amazing. Which helps to learn, inspire, and found new modes in the development phase of a coder. Any contribution to this project is greatly appreciated.

If you have any suggestion or found any issues please free to put your suggestion.

1. You can Fork it

2. Clone the project then

3. Create your branch check out to your branch (git checkout -b)
Suggested naming **feature/ feature_name

4. Commit your changes(git commit -m "new feature name")

5. Push the commit(git push origin feature/feature_name)

5. Open pull request

## LICENSE

[MIT license](LICENSE)















 
