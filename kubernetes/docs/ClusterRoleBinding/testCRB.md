
#### Object: testCRB
#### Type: ClusterRoleBinding

### Cluster에 testCRB ClusterRoleBinding를 생성하려면 아래의 명령어를 실행하세요.

```
kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/ClusterRoleBinding/testCRB.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T013859Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=d010296f058fc6e21d8f4d690c7f060112dbfa496c0ee0805ab45e4c9dc67d87
```
- Yaml 파일에 명시된 스펙으로 testCRB ClusterRoleBinding를 생성합니다.
- StorageClass는 자동으로 볼륨을 생성 & 할당(Dynamic Provisioning)할 수 있게 합니다.

```
kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/testK8S0309/yang1762%40uengine.org/ClusterRoleBinding/testCRB.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230414%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230414T013859Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=d010296f058fc6e21d8f4d690c7f060112dbfa496c0ee0805ab45e4c9dc67d87
```
- Create가 된 상태라면 testCRB ClusterRoleBinding의 수정이 이루어지고, Create가 된 상태가 아니라면 testCRB ClusterRoleBinding를 Create 해주는 명령어입니다.  
#

### 생성된 testCRB ClusterRoleBinding의 상세 실행 정보를 확인하시려면 아래의 명령어를 입력하세요.

```
Kubectl describe ClusterRoleBinding testCRB
```
- testCRB ClusterRoleBinding의 실행 정보 상태를 확인하여 문제가 있는지 확인합니다.  
#

### testCRB ClusterRoleBinding를 삭제하려면 아래의 명령어를 실행하세요.

```
kubectl delete ClusterRoleBinding testCRB
```
#
