// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapBackgroundService",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "CapBackgroundService",
            targets: ["MyBackgroundServicePlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "MyBackgroundServicePlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/MyBackgroundServicePlugin"),
        .testTarget(
            name: "MyBackgroundServicePluginTests",
            dependencies: ["MyBackgroundServicePlugin"],
            path: "ios/Tests/MyBackgroundServicePluginTests")
    ]
)