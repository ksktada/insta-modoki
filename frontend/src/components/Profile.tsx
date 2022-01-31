import React from 'react';

function Profile(name: string, id: string, followers: number, followings: number) {
    return (
        <div>
            <div>{name}</div>
            <div>{id}</div>
            <div>{followers}</div>
            <div>{followings}</div>
        </div>
    )
}

export default Profile;