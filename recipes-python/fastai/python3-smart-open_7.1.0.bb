# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Utils for streaming large files (S3, HDFS, GCS, Azure Blob Storage, gzip, bz2...)"
HOMEPAGE = "https://github.com/piskvorky/smart_open"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c68cd40b6115d100370f3dcee3924cb"

SRC_URI[sha256sum] = "a4f09f84f0f6d3637c6543aca7b5487438877a21360e7368ccf1f704789752ba"

inherit pypi setuptools3

PACKAGECONFIG = " http "

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "all azure gcs http s3 ssh test webhdfs zst"
PACKAGECONFIG[all] = ",,,python3-azure-common python3-azure-core python3-azure-storage-blob python3-boto3 python3-google-cloud-storage python3-paramiko python3-requests python3-zstandard"
PACKAGECONFIG[azure] = ",,,python3-azure-common python3-azure-core python3-azure-storage-blob"
PACKAGECONFIG[gcs] = ",,,python3-google-cloud-storage"
PACKAGECONFIG[http] = ",,,python3-requests"
PACKAGECONFIG[s3] = ",,,python3-boto3"
PACKAGECONFIG[ssh] = ",,,python3-paramiko"
PACKAGECONFIG[test] = ",,,python3-awscli python3-azure-common python3-azure-core python3-azure-storage-blob python3-boto3 python3-google-cloud-storage python3-moto[server] python3-numpy python3-paramiko python3-pyopenssl python3-pytest python3-pytest-rerunfailures python3-pytest_benchmark python3-requests python3-responses python3-zstandard"
PACKAGECONFIG[webhdfs] = ",,,python3-requests"
PACKAGECONFIG[zst] = ",,,python3-zstandard"

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-wrapt"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-asyncio python3-compression python3-core python3-io python3-logging python3-multiprocessing python3-netclient python3-requests python3-typing-extensions python3-unixadmin python3-urllib3"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    azure.core.exceptions
#    azure.storage.blob
#    botocore.client
#    botocore.exceptions
#    google.auth.transport.requests
#    google.cloud.exceptions
#    google.cloud.storage
#    mypy_boto3_s3.client
#    requests_kerberos

PYPI_PACKAGE = "smart-open"
