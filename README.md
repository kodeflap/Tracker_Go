
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

1. You can [clone the repo](https://github.com/poojaOfficial321/Tracker_Go.git) or Fork it

2. Create your branch check out to your branch (git checkout -b)
Suggested naming **feature/ feature_name

3. Commit your changes(git commit -m "new feature name")

4. Push to branch(git push origin feature/feature_name)

5. Open pull request

## LICENSE

[MIT license](LICENSE)















 
