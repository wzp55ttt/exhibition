// 镜像的版本号
def tag = "v1.0"

node {
    stage('拉取代码') {
        checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], extensions: [], userRemoteConfigs: [[credentialsId: '990bc44a-04c8-4514-bcaa-75942b74f4a1', url: 'https://github.com/wzp55ttt/exhibition.git']]])
    }
    stage('编译，打包微服务工程') {

        sh "mvn clean package dockerfile:build"
        // 定义镜像名称
        // def imageName = "${project_name}:${tag}"

        /** // 对镜像打上标签
                    sh "docker tag ${imageName} ${harbor_url}/${harbor_project}/${imageName}"

                    // 把镜像推送到Harbor
                    withCredentials([usernamePassword(credentialsId: "${harbor_auth}", passwordVariable: 'password', usernameVariable: 'username')]) {
                        // 登录到Harbor
                        sh "docker login -u ${username} -p ${password} ${harbor_url}"

                        // 镜像上传
                        sh "docker push ${harbor_url}/${harbor_project}/${imageName}"

                        sh "echo 镜像上传成功"

                        sh "docker run -di "
                    } */
    }
}
