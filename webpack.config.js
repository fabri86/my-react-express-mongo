const path = require("path");

module.exports = {
    mode: 'development', // while we are developing, it will be set to dev, instead to production
    entry: path.resolve(__dirname, 'src','app'), // it is the entrypoint, the file we will start by using. There will be an index.js, taken by default
    output: {
        path: path.resolve(__dirname,'dist'), // distribution folder
        filename: 'bundle.js', // name of the JS bundle
        publicPath: '/', // right inside the dist folder
    },
    resolve: {
        extensions: ['.js','.jsx'] // which extensions webpack should take in consideration in his process of producing the bundle
    },
    devServer: {
        historyApiFallback: true // it enables React-router
    },
    module: { // we describe here how are app has to be compiled 
        rules: [{
            test: /\.jsx?/, // it is a regex that states if a file should or should not be compiled (js or jsx)
            loader:'babel-loader' // we define the loader to be used for these files' transformation
        }]
    }
}