
#### Object: testNS
#### Type: Namespace

### Cluster에 testNS Namespace를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/Namespace/testNS.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T020940Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=465e0285e09ec9f121151db74a6864b263aac7d48bc47247101516d2085cc3b8
```
- Yaml 파일에 명시된 스펙으로 testNS Namespace를 생성합니다.

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/Namespace/testNS.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T020940Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=465e0285e09ec9f121151db74a6864b263aac7d48bc47247101516d2085cc3b8
```
- Create가 된 상태라면 testNS Namespace의 수정이 이루어지고, Create가 된 상태가 아니라면 testNS Namespace를 Create 해주는 명령어입니다.  
#

### testNS Namespace가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get Namespace

NAME            READY   UP-TO-DATE   AVAILABLE   AGE
testNS           3/3     3            3           5m43s

```
- testNS Namespace와 Pod, Replicaset이 모두 확인이 된다면 정상적으로 생성된 것입니다.
#

```
$ kubectl delete Namespace testNS
```
#
