## Comandos

```
./mvnw compile com.google.cloud.tools:jib-maven-plugin:3.2.0:build -Dimage=z0s3r77/springboot-example:latest  -Djib.to.auth.username=z0s3r77 -Djib.to.auth.password=$SECRETPASS
```

```
sudo snap install kubectx --classic
```

## Guia

minikube addons enable ingress



## Versiones

v1 : Disponibles endpoints /api/test/sebas, /api/sebas

v2 : Se quita el endpoint /api/test/sebas (deprecated)

v3: Se añade el endpoint /api/test/read-file


### OLD DOCU

Requisitos

Instalación de Docker
https://docs.docker.com/engine/install/ubuntu/
https://docs.docker.com/engine/install/linux-postinstall/

Instalación de Kubectl
https://kubernetes.io/docs/tasks/tools/install-kubectl-linux/

Instalación Minikube
https://minikube.sigs.k8s.io/docs/start/?arch=%2Flinux%2Fx86-64%2Fstable%2Fbinary+download


Habilitar Ingress de Nginx
https://minikube.sigs.k8s.io/docs/handbook/addons/ingress-dns/#Linux




Inicio

Para levantar un cluster de k8s en local basta con ejecutar:




Una pequeña prueba de que todo marcha bien sería :




Conceptos
Como es una demostración técnica, más que una explicación, a continuación hay un pequeño índice de conceptos ordenados de más sencillo a más complejo.

Contenedor https://www.docker.com/resources/what-container/
Imagenes https://aws.amazon.com/es/compare/the-difference-between-docker-images-and-containers/
Repositorio de imágenes (quay.io, docker hub, Github packages, etc)
Pod https://kubernetes.io/es/docs/concepts/workloads/pods/pod/
Deployment https://kubernetes.io/docs/concepts/workloads/controllers/deployment/
Service https://kubernetes.io/es/docs/concepts/services-networking/service/
Ingress / Regla Ingress https://kubernetes.io/docs/concepts/services-networking/ingress/
Namespace https://kubernetes.io/es/docs/concepts/overview/working-with-objects/namespaces/




Comandos
./mvnw compile com.google.cloud.tools:jib-maven-plugin:3.2.0:build -Dimage=z0s3r77/springboot-example:latest  -Djib.to.auth.username=z0s3r77 -Djib.to.auth.password=$SECRETPASS


Ruta del HostPath de minikube:

/var/hostpath-provisioner/
