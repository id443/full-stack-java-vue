const { defineConfig } = require('@vue/cli-service')
// vue.config.js
module.exports = {
    // https://cli.vuejs.org/config/#devserver-proxy
    devServer: {
        port: 3001,
        proxy: {
            '/api': {
                target: 'http://localhost:8080',
                ws: true,
                changeOrigin: true
            }
        }
    }
}